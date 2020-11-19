package typingsSlinky.phaser.Phaser.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Input {
  
  type HitAreaCallback = js.Function4[
    /* hitArea */ js.Any, 
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* gameObject */ typingsSlinky.phaser.Phaser.GameObjects.GameObject, 
    scala.Unit
  ]
}
