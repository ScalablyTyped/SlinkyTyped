package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.Binding
import typingsSlinky.inversify.interfacesMod.interfaces.Lookup
import typingsSlinky.inversify.interfacesMod.interfaces.Next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerSnapshotMod {
  
  @JSImport("inversify/dts/container/container_snapshot", "ContainerSnapshot")
  @js.native
  class ContainerSnapshot ()
    extends typingsSlinky.inversify.interfacesMod.interfaces.ContainerSnapshot
  object ContainerSnapshot {
    
    /* static member */
    @JSImport("inversify/dts/container/container_snapshot", "ContainerSnapshot.of")
    @js.native
    def of(bindings: Lookup[Binding[_]]): ContainerSnapshot = js.native
    @JSImport("inversify/dts/container/container_snapshot", "ContainerSnapshot.of")
    @js.native
    def of(bindings: Lookup[Binding[_]], middleware: Next): ContainerSnapshot = js.native
  }
}
