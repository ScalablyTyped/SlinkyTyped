package typingsSlinky.rcFieldForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type EventArgs = js.Array[js.Any]
  type InternalNamePath = js.Array[java.lang.String | scala.Double]
  type InternalValidateFields = js.Function2[
    /* nameList */ js.UndefOr[js.Array[typingsSlinky.rcFieldForm.interfaceMod.NamePath]], 
    /* options */ js.UndefOr[typingsSlinky.rcFieldForm.interfaceMod.ValidateOptions], 
    js.Promise[typingsSlinky.rcFieldForm.interfaceMod.Store]
  ]
  type NamePath = java.lang.String | scala.Double | typingsSlinky.rcFieldForm.interfaceMod.InternalNamePath
  type Rule = typingsSlinky.rcFieldForm.interfaceMod.RuleObject | typingsSlinky.rcFieldForm.interfaceMod.RuleRender
  type RuleRender = js.Function1[
    /* form */ typingsSlinky.rcFieldForm.interfaceMod.FormInstance, 
    typingsSlinky.rcFieldForm.interfaceMod.RuleObject
  ]
  type Store = org.scalablytyped.runtime.StringDictionary[typingsSlinky.rcFieldForm.interfaceMod.StoreValue]
  type StoreValue = js.Any
  type ValidateFields = js.Function1[
    /* nameList */ js.UndefOr[js.Array[typingsSlinky.rcFieldForm.interfaceMod.NamePath]], 
    js.Promise[typingsSlinky.rcFieldForm.interfaceMod.Store]
  ]
  type ValidateMessage = java.lang.String | js.Function0[java.lang.String]
  type Validator = js.Function3[
    /* rule */ typingsSlinky.rcFieldForm.interfaceMod.RuleObject, 
    /* value */ typingsSlinky.rcFieldForm.interfaceMod.StoreValue, 
    /* callback */ js.Function1[/* error */ js.UndefOr[java.lang.String], scala.Unit], 
    js.Promise[scala.Unit] | scala.Unit
  ]
  type ValuedNotifyInfo = typingsSlinky.rcFieldForm.interfaceMod.NotifyInfo with typingsSlinky.rcFieldForm.anon.Store
}
