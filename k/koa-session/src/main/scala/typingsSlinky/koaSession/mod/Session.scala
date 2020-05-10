package typingsSlinky.koaSession.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.koaSession.koaSessionStrings.session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Session model.
  */
@js.native
trait Session
  extends /**
  * allow to put any value on session object
  */
/* _ */ StringDictionary[js.Any] {
  /**
    * Return how many values there are in the session object.
    * Used to see if it"s "populated".
    */
  val length: Double = js.native
  /**
    * get/set session maxAge
    */
  var maxAge: js.UndefOr[Double | session] = js.native
  /**
    * populated flag, which is just a boolean alias of .length.
    */
  val populated: Boolean = js.native
  /**
    * alias to `toJSON`
    */
  def inspect(): js.Object = js.native
  /**
    * save this session no matter whether it is populated
    */
  def save(): Unit = js.native
  /**
    * JSON representation of the session.
    */
  def toJSON(): js.Object = js.native
}

object Session {
  @scala.inline
  def apply(
    inspect: () => js.Object,
    length: Double,
    populated: Boolean,
    save: () => Unit,
    toJSON: () => js.Object
  ): Session = {
    val __obj = js.Dynamic.literal(inspect = js.Any.fromFunction0(inspect), length = length.asInstanceOf[js.Any], populated = populated.asInstanceOf[js.Any], save = js.Any.fromFunction0(save), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Session]
  }
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInspect(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopulated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMaxAge(value: Double | session): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
  }
  
}

