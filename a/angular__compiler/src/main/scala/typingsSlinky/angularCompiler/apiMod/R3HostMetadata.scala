package typingsSlinky.angularCompiler.apiMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.AnonClassAttr
import typingsSlinky.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3HostMetadata extends js.Object {
  /**
    * A mapping of attribute binding keys to `o.Expression`s.
    */
  var attributes: StringDictionary[Expression] = js.native
  /**
    * A mapping of event binding keys to unparsed expressions.
    */
  var listeners: StringDictionary[String] = js.native
  /**
    * A mapping of property binding keys to unparsed expressions.
    */
  var properties: StringDictionary[String] = js.native
  var specialAttributes: AnonClassAttr = js.native
}

object R3HostMetadata {
  @scala.inline
  def apply(
    attributes: StringDictionary[Expression],
    listeners: StringDictionary[String],
    properties: StringDictionary[String],
    specialAttributes: AnonClassAttr
  ): R3HostMetadata = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], specialAttributes = specialAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3HostMetadata]
  }
  @scala.inline
  implicit class R3HostMetadataOps[Self <: R3HostMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: StringDictionary[Expression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListeners(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecialAttributes(value: AnonClassAttr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialAttributes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

