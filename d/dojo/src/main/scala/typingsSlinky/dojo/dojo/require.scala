package typingsSlinky.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/require.html
  *
  *
  */
@js.native
trait require extends js.Object {
  /**
    *
    */
  var dynamic: Double = js.native
  /**
    *
    */
  var load: js.Object = js.native
  /**
    *
    * @param id
    */
  def normalize(id: js.Any): js.Any = js.native
}

object require {
  @scala.inline
  def apply(dynamic: Double, load: js.Object, normalize: js.Any => js.Any): require = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], normalize = js.Any.fromFunction1(normalize))
    __obj.asInstanceOf[require]
  }
  @scala.inline
  implicit class requireOps[Self <: require] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalize(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

