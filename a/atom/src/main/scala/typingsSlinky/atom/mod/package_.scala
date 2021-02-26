package typingsSlinky.atom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CommandRegistryListener[TargetType /* <: org.scalajs.dom.raw.EventTarget */] = typingsSlinky.atom.anon.Description[TargetType] | (js.Function1[
    /* event */ typingsSlinky.atom.mod.CommandEvent[TargetType], 
    scala.Unit | js.Promise[scala.Unit]
  ])
  
  type FilesystemChange = (typingsSlinky.atom.mod.FilesystemChangeBasic[
    typingsSlinky.atom.atomStrings.created | typingsSlinky.atom.atomStrings.modified | typingsSlinky.atom.atomStrings.deleted
  ]) | typingsSlinky.atom.mod.FilesystemChangeRename
  
  type FilesystemChangeEvent = js.Array[typingsSlinky.atom.mod.FilesystemChange]
  
  type FocusableHTMLElement = org.scalajs.dom.raw.HTMLElement | java.lang.String | js.Function0[org.scalajs.dom.raw.HTMLElement]
  
  type PointCompatible = typingsSlinky.atom.mod.PointLike | (js.Tuple2[scala.Double, scala.Double])
  
  type RangeCompatible = typingsSlinky.atom.mod.RangeLike | (js.Tuple2[
    typingsSlinky.atom.mod.PointLike | (js.Tuple2[scala.Double, scala.Double]), 
    typingsSlinky.atom.mod.PointLike | (js.Tuple2[scala.Double, scala.Double])
  ])
  
  type TestRunner = js.Function1[/* params */ typingsSlinky.atom.mod.TestRunnerParams, js.Promise[scala.Double]]
  
  @scala.inline
  def watchPath(
    rootPath: java.lang.String,
    options: js.Object,
    eventCallback: js.Function1[/* events */ typingsSlinky.atom.mod.FilesystemChangeEvent, scala.Unit]
  ): js.Promise[typingsSlinky.atom.mod.PathWatcher] = (typingsSlinky.atom.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watchPath")(rootPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.atom.mod.PathWatcher]]
}
