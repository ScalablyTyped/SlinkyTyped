package typingsSlinky.phaser.Phaser.Types.GameObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Group {
  
  type GroupCallback = js.Function1[/* item */ typingsSlinky.phaser.Phaser.GameObjects.GameObject, scala.Unit]
  
  type GroupMultipleCreateCallback = js.Function1[
    /* items */ js.Array[typingsSlinky.phaser.Phaser.GameObjects.GameObject], 
    scala.Unit
  ]
}
