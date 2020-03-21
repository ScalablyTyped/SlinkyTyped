package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier
import typingsSlinky.inversify.interfacesMod.interfaces.TargetType
import typingsSlinky.inversify.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/planning/target", JSImport.Namespace)
@js.native
object targetMod extends js.Object {
  @js.native
  class Target protected ()
    extends typingsSlinky.inversify.interfacesMod.interfaces.Target {
    def this(`type`: TargetType, name: String, serviceIdentifier: ServiceIdentifier[_]) = this()
    def this(`type`: TargetType, name: String, serviceIdentifier: ServiceIdentifier[_], namedOrTagged: String) = this()
    def this(`type`: TargetType, name: String, serviceIdentifier: ServiceIdentifier[_], namedOrTagged: Metadata) = this()
  }
  
}

