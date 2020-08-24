package typingsSlinky.expoConfigureSplashScreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xmlManipulationMod {
  type ExpectedElementAttributes = typingsSlinky.std.Record[
    java.lang.String, 
    typingsSlinky.expoConfigureSplashScreen.xmlManipulationMod.WithExplicitNewValue[js.UndefOr[java.lang.String | scala.Double]]
  ]
  type ExpectedElements = typingsSlinky.expoConfigureSplashScreen.xmlManipulationMod.WithExplicitNewValue[
    js.Array[
      typingsSlinky.expoConfigureSplashScreen.xmlManipulationMod.WithExplicitIndex[
        typingsSlinky.expoConfigureSplashScreen.xmlManipulationMod.WithDeletionFlag[typingsSlinky.expoConfigureSplashScreen.xmlManipulationMod.ExpectedElement]
      ]
    ]
  ]
  type WithDeletionFlag[T] = T with typingsSlinky.expoConfigureSplashScreen.anon.DeletionFlag
  type WithExplicitIndex[T] = T with typingsSlinky.expoConfigureSplashScreen.anon.Idx
  type WithExplicitNewValue[T] = T | typingsSlinky.expoConfigureSplashScreen.xmlManipulationMod.ExplicitNewValue[T]
}
