package typingsSlinky.alt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object AltJS {
  
  type ActionHandler = js.Function1[/* repeated */ js.Any, js.Any]
  
  type Actions = org.scalablytyped.runtime.StringDictionary[typingsSlinky.alt.AltJS.Action[js.Any]]
  
  type ActionsClassConstructor = org.scalablytyped.runtime.Instantiable1[/* alt */ typingsSlinky.alt.AltJS.Alt, typingsSlinky.alt.AltJS.ActionsClass]
  
  type ExportConfig = org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]
  
  type Source = org.scalablytyped.runtime.StringDictionary[js.Function0[typingsSlinky.alt.AltJS.SourceModel[js.Any]]]
  
  type StateTransform = js.Function1[
    /* store */ typingsSlinky.alt.AltJS.StoreModel[js.Any], 
    typingsSlinky.alt.AltJS.AltStore[js.Any]
  ]
}
