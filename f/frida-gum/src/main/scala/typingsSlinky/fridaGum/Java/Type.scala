package typingsSlinky.fridaGum.Java

import typingsSlinky.fridaGum.NativePointerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends js.Object {
  /**
    * Size in bytes.
    */
  var byteSize: Double = js.native
  /**
    * Class name, if applicable.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Converts `value` from a JNI value to a JavaScript value.
    */
  var fromJni: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  /**
    * VM type name. For example `I` for `int`.
    */
  var name: String = js.native
  /**
    * Reads a value from memory.
    */
  var read: js.UndefOr[js.Function1[/* address */ NativePointerValue, _]] = js.native
  /**
    * Size in words.
    */
  var size: Double = js.native
  /**
    * Converts `value` from a JavaScript value to a JNI value.
    */
  var toJni: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  /**
    * Frida type name. For example `pointer` for a handle.
    */
  var `type`: String = js.native
  /**
    * Writes a value to memory.
    */
  var write: js.UndefOr[js.Function2[/* address */ NativePointerValue, /* value */ js.Any, Unit]] = js.native
  /**
    * Checks whether a given JavaScript `value` is compatible.
    */
  def isCompatible(value: js.Any): Boolean = js.native
}

object Type {
  @scala.inline
  def apply(byteSize: Double, isCompatible: js.Any => Boolean, name: String, size: Double, `type`: String): Type = {
    val __obj = js.Dynamic.literal(byteSize = byteSize.asInstanceOf[js.Any], isCompatible = js.Any.fromFunction1(isCompatible), name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCompatible(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompatible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withFromJni(value: /* value */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromJni")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFromJni: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromJni")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: /* address */ NativePointerValue => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withToJni(value: /* value */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJni")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToJni: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJni")(js.undefined)
        ret
    }
    @scala.inline
    def withWrite(value: (/* address */ NativePointerValue, /* value */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.undefined)
        ret
    }
  }
  
}

