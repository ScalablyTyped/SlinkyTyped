package typingsSlinky.grpcGrpcJs.resolverMod

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.grpcGrpcJs.uriParserMod.GrpcUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverConstructor extends Instantiable2[/* target */ GrpcUri, /* listener */ ResolverListener, Resolver] {
  
  /**
    * Get the default authority for a target. This loosely corresponds to that
    * target's hostname. Throws an error if this resolver class cannot parse the
    * `target`.
    * @param target
    */
  def getDefaultAuthority(target: GrpcUri): String = js.native
}
