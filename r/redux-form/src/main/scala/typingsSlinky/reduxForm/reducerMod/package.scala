package typingsSlinky.reduxForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object reducerMod {
  
  type FormReducerMapObject = // and `<any>` to make it compatible with redux@3
  // tslint:disable-next-line use-default-type-parameter
  org.scalablytyped.runtime.StringDictionary[typingsSlinky.redux.mod.Reducer[js.Any, typingsSlinky.redux.mod.AnyAction]]
  
  type FormStateMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reduxForm.reducerMod.FormState]
}
