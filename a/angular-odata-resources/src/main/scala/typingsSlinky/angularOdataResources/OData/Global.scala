package typingsSlinky.angularOdataResources.OData

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.angularOdataResources.anon.TypeofPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Global extends js.Object {
  var BinaryOperation: Instantiable3[
    /* propertyOrPredicate */ js.Any, 
    js.UndefOr[/* valueOrOperator */ js.Any], 
    js.UndefOr[/* value */ js.Any], 
    typingsSlinky.angularOdataResources.OData.BinaryOperation
  ] = js.native
  var Func: Instantiable2[/* methodName */ String, /* args (repeated) */ js.Any, MethodCall] = js.native
  var OrderBy: Instantiable2[/* propertyName */ String, js.UndefOr[/* sortOrder */ String], OrderByStatement] = js.native
  var Predicate: TypeofPredicate = js.native
  var Property: Instantiable1[/* value */ String, typingsSlinky.angularOdataResources.OData.Property] = js.native
  var Provider: typingsSlinky.angularOdataResources.OData.Provider[_] = js.native
  var Value: Instantiable2[
    /* value */ js.Any, 
    js.UndefOr[/* type */ String], 
    typingsSlinky.angularOdataResources.OData.Value
  ] = js.native
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
  @scala.inline
  implicit class GlobalOps[Self <: Global] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinaryOperation(
      value: Instantiable3[
          /* propertyOrPredicate */ js.Any, 
          js.UndefOr[/* valueOrOperator */ js.Any], 
          js.UndefOr[/* value */ js.Any], 
          BinaryOperation
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunc(value: Instantiable2[/* methodName */ String, /* args (repeated) */ js.Any, MethodCall]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Func")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrderBy(
      value: Instantiable2[/* propertyName */ String, js.UndefOr[/* sortOrder */ String], OrderByStatement]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredicate(value: TypeofPredicate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Predicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: Instantiable1[/* value */ String, Property]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: Provider[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Instantiable2[/* value */ js.Any, js.UndefOr[/* type */ String], Value]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

