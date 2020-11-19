package typingsSlinky.awsSdkClientGlacierNode.typesSelectParametersMod

import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.SQL
import typingsSlinky.awsSdkClientGlacierNode.typesInputSerializationMod.InputSerialization
import typingsSlinky.awsSdkClientGlacierNode.typesOutputSerializationMod.OutputSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectParameters extends js.Object {
  
  /**
    * <p>The expression that is used to select the object.</p>
    */
  var Expression: js.UndefOr[String] = js.native
  
  /**
    * <p>The type of the provided expression, for example <code>SQL</code>.</p>
    */
  var ExpressionType: js.UndefOr[SQL | String] = js.native
  
  /**
    * <p>Describes the serialization format of the object.</p>
    */
  var InputSerialization: js.UndefOr[
    typingsSlinky.awsSdkClientGlacierNode.typesInputSerializationMod.InputSerialization
  ] = js.native
  
  /**
    * <p>Describes how the results of the select job are serialized.</p>
    */
  var OutputSerialization: js.UndefOr[
    typingsSlinky.awsSdkClientGlacierNode.typesOutputSerializationMod.OutputSerialization
  ] = js.native
}
object SelectParameters {
  
  @scala.inline
  def apply(): SelectParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectParameters]
  }
  
  @scala.inline
  implicit class SelectParametersOps[Self <: SelectParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExpression(value: String): Self = this.set("Expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpression: Self = this.set("Expression", js.undefined)
    
    @scala.inline
    def setExpressionType(value: SQL | String): Self = this.set("ExpressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionType: Self = this.set("ExpressionType", js.undefined)
    
    @scala.inline
    def setInputSerialization(value: InputSerialization): Self = this.set("InputSerialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputSerialization: Self = this.set("InputSerialization", js.undefined)
    
    @scala.inline
    def setOutputSerialization(value: OutputSerialization): Self = this.set("OutputSerialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputSerialization: Self = this.set("OutputSerialization", js.undefined)
  }
}
