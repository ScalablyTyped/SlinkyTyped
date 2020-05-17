package typingsSlinky.box2d.Box2D.Collision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2ContactID extends js.Object {
  /**
  		* ID Key
  		**/
  var Key: Double = js.native
  /**
  		* Features
  		**/
  var features: Features = js.native
  /**
  		* Copies the Contact ID.
  		* @return Copied Contact ID.
  		**/
  def Copy(): b2ContactID = js.native
  /**
  		* Sets the Contact ID from a Contact ID.
  		* @param id The Contact ID to copy values from.
  		**/
  def Set(id: b2ContactID): Unit = js.native
}

object b2ContactID {
  @scala.inline
  def apply(Copy: () => b2ContactID, Key: Double, Set: b2ContactID => Unit, features: Features): b2ContactID = {
    val __obj = js.Dynamic.literal(Copy = js.Any.fromFunction0(Copy), Key = Key.asInstanceOf[js.Any], Set = js.Any.fromFunction1(Set), features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2ContactID]
  }
  @scala.inline
  implicit class b2ContactIDOps[Self <: b2ContactID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: () => b2ContactID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: b2ContactID => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFeatures(value: Features): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

