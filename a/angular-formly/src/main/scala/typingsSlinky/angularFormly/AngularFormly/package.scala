package typingsSlinky.angularFormly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AngularFormly {
  /**
    * see http://docs.angular-formly.com/docs/formly-expressions#expressionproperties-validators--messages
    */
  type IExpressionFunction = js.Function3[
    /* $viewValue */ js.Any, 
    /* $modelValue */ js.Any, 
    /* scope */ typingsSlinky.angularFormly.AngularFormly.ITemplateScope, 
    js.Any
  ]
  type IFieldArray = js.Array[
    typingsSlinky.angularFormly.AngularFormly.IFieldConfigurationObject | typingsSlinky.angularFormly.AngularFormly.IFieldGroup
  ]
  type ITemplateManipulator = js.Function3[
    /* template */ java.lang.String | org.scalajs.dom.raw.HTMLElement, 
    /* options */ js.Object, 
    /* scope */ typingsSlinky.angularFormly.AngularFormly.ITemplateScope, 
    java.lang.String | org.scalajs.dom.raw.HTMLElement
  ]
}
