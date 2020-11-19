package typingsSlinky.formsyReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interfacesMod {
  
  type IModel = js.Any
  
  type IResetModel = js.Function1[/* model */ js.UndefOr[typingsSlinky.formsyReact.interfacesMod.IModel], scala.Unit]
  
  type IUpdateInputsWithError = js.Function2[
    /* errors */ org.scalablytyped.runtime.StringDictionary[typingsSlinky.formsyReact.interfacesMod.ValidationError], 
    /* invalidate */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  
  type IUpdateInputsWithValue[V] = js.Function2[
    /* values */ org.scalablytyped.runtime.StringDictionary[V], 
    /* validate */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  
  type RequiredValidation[V] = scala.Boolean | typingsSlinky.formsyReact.interfacesMod.Validations[V]
  
  type Validation[V] = java.lang.String | scala.Boolean | typingsSlinky.formsyReact.interfacesMod.ValidationFunction[V]
  
  type ValidationError = java.lang.String | slinky.core.facade.ReactElement
  
  type ValidationFunction[V] = js.Function3[
    /* values */ typingsSlinky.formsyReact.interfacesMod.Values, 
    /* value */ V, 
    /* extra */ js.UndefOr[js.Any], 
    scala.Boolean | typingsSlinky.formsyReact.interfacesMod.ValidationError
  ]
  
  type Validations[V] = typingsSlinky.formsyReact.interfacesMod.ValidationsStructure[V] | java.lang.String | js.Object
  
  type ValidationsStructure[V] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.formsyReact.interfacesMod.Validation[V]]
  
  type Values = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type WrappedComponentClass = slinky.core.ReactComponentClass[js.Object] | typingsSlinky.formsyReact.interfacesMod.ComponentWithStaticAttributes
}
