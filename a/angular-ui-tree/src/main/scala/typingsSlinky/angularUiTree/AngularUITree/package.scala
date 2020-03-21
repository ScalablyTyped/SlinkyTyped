package typingsSlinky.angularUiTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AngularUITree {
  type IAcceptCallback = js.Function3[
    /* source */ typingsSlinky.angularUiTree.AngularUITree.ITreeNodeScope, 
    /* destination */ typingsSlinky.angularUiTree.AngularUITree.ITreeNodeScope, 
    /* destinationIndex */ scala.Double, 
    scala.Boolean
  ]
  type IDroppedCallback = js.Function1[/* eventInfo */ typingsSlinky.angularUiTree.AngularUITree.IEventInfo, scala.Unit]
}
