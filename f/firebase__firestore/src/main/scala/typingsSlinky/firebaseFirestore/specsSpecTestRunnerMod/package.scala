package typingsSlinky.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object specsSpecTestRunnerMod {
  type SpecQueryFilter = js.Tuple3[java.lang.String, java.lang.String, js.Any]
  type SpecQueryOrderBy = js.Tuple2[java.lang.String, java.lang.String]
  type SpecUserDelete = java.lang.String
  type SpecUserListen = js.Tuple2[
    typingsSlinky.firebaseFirestore.coreTypesMod.TargetId, 
    java.lang.String | typingsSlinky.firebaseFirestore.specsSpecTestRunnerMod.SpecQuery
  ]
  type SpecUserPatch = js.Tuple2[
    java.lang.String, 
    typingsSlinky.firebaseFirestore.modelObjectValueMod.JsonObject[js.Any]
  ]
  type SpecUserSet = js.Tuple2[
    java.lang.String, 
    typingsSlinky.firebaseFirestore.modelObjectValueMod.JsonObject[js.Any]
  ]
  type SpecUserUnlisten = js.Tuple2[
    typingsSlinky.firebaseFirestore.coreTypesMod.TargetId, 
    java.lang.String | typingsSlinky.firebaseFirestore.specsSpecTestRunnerMod.SpecQuery
  ]
  type SpecWatchAck = js.Array[typingsSlinky.firebaseFirestore.coreTypesMod.TargetId]
  type SpecWatchCurrent = js.Tuple2[js.Array[typingsSlinky.firebaseFirestore.coreTypesMod.TargetId], java.lang.String]
  type SpecWatchReset = js.Array[typingsSlinky.firebaseFirestore.coreTypesMod.TargetId]
}
