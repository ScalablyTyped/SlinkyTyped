package typingsSlinky.angularOdataResources.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.angularOdataResources.OData.IExecutable
import typingsSlinky.angularOdataResources.OData.Predicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPredicate
  extends Instantiable1[/* propertyOrValueOrPredicate */ js.Any, Predicate]
     with Instantiable2[/* propertyOrValueOrPredicate */ js.Any, /* valueOrOperator */ js.Any, Predicate]
     with Instantiable3[
      /* propertyOrValueOrPredicate */ js.Any, 
      js.UndefOr[/* valueOrOperator */ js.Any], 
      /* value */ js.Any, 
      Predicate
    ] {
  
  def and(andStatements: js.Any): IExecutable = js.native
  
  def create(propertyOrPredicate: js.Any): IExecutable = js.native
  def create(propertyOrPredicate: js.Any, operatorOrValue: js.UndefOr[scala.Nothing], value: js.Any): IExecutable = js.native
  def create(propertyOrPredicate: js.Any, operatorOrValue: js.Any): IExecutable = js.native
  def create(propertyOrPredicate: js.Any, operatorOrValue: js.Any, value: js.Any): IExecutable = js.native
  
  def or(orStatements: js.Array[_]): IExecutable = js.native
}
