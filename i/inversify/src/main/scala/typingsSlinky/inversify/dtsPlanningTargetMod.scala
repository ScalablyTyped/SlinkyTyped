package typingsSlinky.inversify

import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.TargetType
import typingsSlinky.inversify.dtsPlanningMetadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/planning/target", JSImport.Namespace)
@js.native
object dtsPlanningTargetMod extends js.Object {
  @js.native
  class Target protected ()
    extends typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.Target {
    def this(`type`: TargetType, name: String, serviceIdentifier: ServiceIdentifier[_]) = this()
    def this(`type`: TargetType, name: String, serviceIdentifier: ServiceIdentifier[_], namedOrTagged: String) = this()
    def this(`type`: TargetType, name: String, serviceIdentifier: ServiceIdentifier[_], namedOrTagged: Metadata) = this()
  }
  
}

