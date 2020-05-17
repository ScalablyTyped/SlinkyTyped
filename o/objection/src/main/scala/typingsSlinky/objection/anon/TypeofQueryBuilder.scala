package typingsSlinky.objection.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.objection.mod.Model
import typingsSlinky.objection.mod.ModelClass
import typingsSlinky.objection.mod.QueryBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofQueryBuilder
  extends Instantiable0[QueryBuilder[Model, js.Object, js.Object]] {
  def forClass[M /* <: Model */, MC /* <: ModelClass[M] */](modelClass: MC): QueryBuilder[
    M, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
}

