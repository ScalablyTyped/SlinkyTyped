package typingsSlinky.jestResolveDependencies.mod

import typingsSlinky.jestHasteMap.mod.FS
import typingsSlinky.jestSnapshot.mod.SnapshotResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DependencyResolver is used to resolve the direct dependencies of a module or
  * to retrieve a list of all transitive inverse dependencies.
  */
@JSImport("jest-resolve-dependencies", JSImport.Namespace)
@js.native
class ^ protected () extends DependencyResolver {
  def this(
    resolver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolverType */ js.Any,
    hasteFS: FS,
    snapshotResolver: SnapshotResolver
  ) = this()
}

