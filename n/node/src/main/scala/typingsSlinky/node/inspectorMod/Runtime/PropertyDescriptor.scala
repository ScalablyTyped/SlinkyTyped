package typingsSlinky.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object property descriptor.
  */
@js.native
trait PropertyDescriptor extends js.Object {
  /**
    * True if the type of this property descriptor may be changed and if the property may be deleted from the corresponding object.
    */
  var configurable: Boolean = js.native
  /**
    * True if this property shows up during enumeration of the properties on the corresponding object.
    */
  var enumerable: Boolean = js.native
  /**
    * A function which serves as a getter for the property, or <code>undefined</code> if there is no getter (accessor descriptors only).
    */
  var get: js.UndefOr[RemoteObject] = js.native
  /**
    * True if the property is owned for the object.
    */
  var isOwn: js.UndefOr[Boolean] = js.native
  /**
    * Property name or symbol description.
    */
  var name: String = js.native
  /**
    * A function which serves as a setter for the property, or <code>undefined</code> if there is no setter (accessor descriptors only).
    */
  var set: js.UndefOr[RemoteObject] = js.native
  /**
    * Property symbol object, if the property is of the <code>symbol</code> type.
    */
  var symbol: js.UndefOr[RemoteObject] = js.native
  /**
    * The value associated with the property.
    */
  var value: js.UndefOr[RemoteObject] = js.native
  /**
    * True if the result was thrown during the evaluation.
    */
  var wasThrown: js.UndefOr[Boolean] = js.native
  /**
    * True if the value associated with the property may be changed (data descriptors only).
    */
  var writable: js.UndefOr[Boolean] = js.native
}

object PropertyDescriptor {
  @scala.inline
  def apply(configurable: Boolean, enumerable: Boolean, name: String): PropertyDescriptor = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyDescriptor]
  }
  @scala.inline
  implicit class PropertyDescriptorOps[Self <: PropertyDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnumerable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: RemoteObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOwn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOwn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOwn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOwn")(js.undefined)
        ret
    }
    @scala.inline
    def withSet(value: RemoteObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbol(value: RemoteObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: RemoteObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withWasThrown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasThrown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWasThrown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasThrown")(js.undefined)
        ret
    }
    @scala.inline
    def withWritable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writable")(js.undefined)
        ret
    }
  }
  
}

