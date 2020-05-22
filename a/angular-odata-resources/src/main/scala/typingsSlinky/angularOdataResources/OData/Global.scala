package typingsSlinky.angularOdataResources.OData

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.angularOdataResources.anon.TypeofPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Global extends js.Object {
  var BinaryOperation: Instantiable3[
    /* propertyOrPredicate */ js.Any, 
    js.UndefOr[/* valueOrOperator */ js.Any], 
    js.UndefOr[/* value */ js.Any], 
    typingsSlinky.angularOdataResources.OData.BinaryOperation
  ]
  var Func: Instantiable2[/* methodName */ String, /* args (repeated) */ js.Any, MethodCall]
  var OrderBy: Instantiable2[/* propertyName */ String, js.UndefOr[/* sortOrder */ String], OrderByStatement]
  var Predicate: TypeofPredicate
  var Property: Instantiable1[/* value */ String, typingsSlinky.angularOdataResources.OData.Property]
  var Provider: typingsSlinky.angularOdataResources.OData.Provider[_]
  var Value: Instantiable2[
    /* value */ js.Any, 
    js.UndefOr[/* type */ String], 
    typingsSlinky.angularOdataResources.OData.Value
  ]
}

object Global {
  @scala.inline
  def apply(
    BinaryOperation: Instantiable3[
      /* propertyOrPredicate */ js.Any, 
      js.UndefOr[/* valueOrOperator */ js.Any], 
      js.UndefOr[/* value */ js.Any], 
      BinaryOperation
    ],
    Func: Instantiable2[/* methodName */ String, /* args (repeated) */ js.Any, MethodCall],
    OrderBy: Instantiable2[/* propertyName */ String, js.UndefOr[/* sortOrder */ String], OrderByStatement],
    Predicate: TypeofPredicate,
    Property: Instantiable1[/* value */ String, Property],
    Provider: Provider[_],
    Value: Instantiable2[/* value */ js.Any, js.UndefOr[/* type */ String], Value]
  ): Global = {
    val __obj = js.Dynamic.literal(BinaryOperation = BinaryOperation.asInstanceOf[js.Any], Func = Func.asInstanceOf[js.Any], OrderBy = OrderBy.asInstanceOf[js.Any], Predicate = Predicate.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Global]
  }
}

