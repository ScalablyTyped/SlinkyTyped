package typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains all the information related to a property
  * @see XLayerContentDescriber
  */
@js.native
trait PropertyInfo extends js.Object {
  /** The full name of the Property for eg. org.openoffice.Inet/Settings/ooInetHTTPProxyName */
  var Name: String = js.native
  /** Is the property protected, if true the property can not be over written in later layer. */
  var Protected: Boolean = js.native
  /** The type of the Property */
  var Type: String = js.native
  /** The value of the property */
  var Value: js.Any = js.native
}

object PropertyInfo {
  @scala.inline
  def apply(Name: String, Protected: Boolean, Type: String, Value: js.Any): PropertyInfo = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Protected = Protected.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyInfo]
  }
  @scala.inline
  implicit class PropertyInfoOps[Self <: PropertyInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

