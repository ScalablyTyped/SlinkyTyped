package typingsSlinky.firebase.mod.default

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object firestore {
  
  @scala.inline
  def apply(): typingsSlinky.firebase.mod.firebase.firestore.Firestore = typingsSlinky.firebase.mod.default.firestore.^.asInstanceOf[js.Dynamic].applyDynamic("firestore")().asInstanceOf[typingsSlinky.firebase.mod.firebase.firestore.Firestore]
  @scala.inline
  def apply(app: typingsSlinky.firebase.mod.firebase.app.App): typingsSlinky.firebase.mod.firebase.firestore.Firestore = typingsSlinky.firebase.mod.default.firestore.^.asInstanceOf[js.Dynamic].applyDynamic("firestore")(app.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.firebase.mod.firebase.firestore.Firestore]
  
  @scala.inline
  def CACHE_SIZE_UNLIMITED: scala.Double = typingsSlinky.firebase.mod.default.firestore.^.asInstanceOf[js.Dynamic].selectDynamic("CACHE_SIZE_UNLIMITED").asInstanceOf[scala.Double]
  
  type DocumentData = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type UpdateData = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  @scala.inline
  def setLogLevel(logLevel: typingsSlinky.firebase.mod.firebase.firestore.LogLevel): scala.Unit = typingsSlinky.firebase.mod.default.firestore.^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
