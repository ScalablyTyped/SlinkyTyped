package typingsSlinky.pathfinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type JumpPointFinder = js.Function1[
    /* opt */ typingsSlinky.pathfinding.mod.JumpPointFinderOptions, 
    typingsSlinky.pathfinding.mod.JPFNeverMoveDiagonally | typingsSlinky.pathfinding.mod.JPFAlwaysMoveDiagonally | typingsSlinky.pathfinding.mod.JPFMoveDiagonallyIfNoObstacles | typingsSlinky.pathfinding.mod.JPFMoveDiagonallyIfAtMostOneObstacle
  ]
}
