package typingsSlinky.pulumiAws.inputMod.wafv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatement extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
    */
  var arn: Input[String] = js.native
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[
    Input[
      WebAclRuleStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch
    ]
  ] = js.native
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: Input[
    js.Array[
      Input[
        WebAclRuleStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformation
      ]
    ]
  ] = js.native
}
object WebAclRuleStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatement {
  
  @scala.inline
  def apply(
    arn: Input[String],
    textTransformations: Input[
      js.Array[
        Input[
          WebAclRuleStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformation
        ]
      ]
    ]
  ): WebAclRuleStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatement = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementOps[Self <: WebAclRuleStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatement] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformationsVarargs(
      value: (Input[
          WebAclRuleStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformation
        ])*
    ): Self = this.set("textTransformations", js.Array(value :_*))
    
    @scala.inline
    def setTextTransformations(
      value: Input[
          js.Array[
            Input[
              WebAclRuleStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformation
            ]
          ]
        ]
    ): Self = this.set("textTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatch(
      value: Input[
          WebAclRuleStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch
        ]
    ): Self = this.set("fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldToMatch: Self = this.set("fieldToMatch", js.undefined)
  }
}
