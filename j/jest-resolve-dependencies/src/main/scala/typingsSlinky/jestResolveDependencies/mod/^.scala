package typingsSlinky.jestResolveDependencies.mod

import typingsSlinky.jestHasteMap.mod.FS
import typingsSlinky.jestResolve.mod.ResolverType
import typingsSlinky.jestSnapshot.mod.SnapshotResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DependencyResolver is used to resolve the direct dependencies of a module or
  * to retrieve a list of all transitive inverse dependencies.
  */
@JSImport("jest-resolve-dependencies", JSImport.Namespace)
@js.native
class ^ protected () extends DependencyResolver {
  def this(resolver: ResolverType, hasteFS: FS, snapshotResolver: SnapshotResolver) = this()
}
