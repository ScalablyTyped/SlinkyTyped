package typingsSlinky.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogicalLocation extends js.Object {
  /**
    * The machine-readable name for the logical location, such as a mangled function name provided by a C++ compiler
    * that encodes calling convention, return type and other details along with the function name.
    */
  var decoratedName: js.UndefOr[String] = js.native
  /**
    * The human-readable fully qualified name of the logical location.
    */
  var fullyQualifiedName: js.UndefOr[String] = js.native
  /**
    * The index within the logical locations array.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * The type of construct this logical location component refers to. Should be one of 'function', 'member',
    * 'module', 'namespace', 'parameter', 'resource', 'returnType', 'type', 'variable', 'object', 'array', 'property',
    * 'value', 'element', 'text', 'attribute', 'comment', 'declaration', 'dtd' or 'processingInstruction', if any of
    * those accurately describe the construct.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Identifies the construct in which the result occurred. For example, this property might contain the name of a
    * class or a method.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Identifies the index of the immediate parent of the construct in which the result was detected. For example,
    * this property might point to a logical location that represents the namespace that holds a type.
    */
  var parentIndex: js.UndefOr[Double] = js.native
  /**
    * Key/value pairs that provide additional information about the logical location.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
}

object LogicalLocation {
  @scala.inline
  def apply(): LogicalLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogicalLocation]
  }
  @scala.inline
  implicit class LogicalLocationOps[Self <: LogicalLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecoratedName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoratedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecoratedName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoratedName")(js.undefined)
        ret
    }
    @scala.inline
    def withFullyQualifiedName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyQualifiedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullyQualifiedName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyQualifiedName")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParentIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

