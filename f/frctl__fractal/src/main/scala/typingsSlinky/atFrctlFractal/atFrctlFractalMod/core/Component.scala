package typingsSlinky.atFrctlFractal.atFrctlFractalMod.core

import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.atFrctlFractal.atFrctlFractalMod.fractal.api.assets.AssetCollection
import typingsSlinky.atFrctlFractal.atFrctlFractalMod.fractal.api.files.FileCollection
import typingsSlinky.atFrctlFractal.atFrctlFractalMod.fractal.api.variants.VariantCollection
import typingsSlinky.atFrctlFractal.atFrctlFractalMod.fractal.core.entities.Entity
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "core.Component")
@js.native
object Component
  extends Instantiable4[
      /* config */ js.Object, 
      /* files */ FileCollection, 
      /* resources */ AssetCollection, 
      /* parent */ Entity, 
      typingsSlinky.atFrctlFractal.atFrctlFractalMod.fractal.api.components.Component
    ] {
  def create(config: js.Object, files: FileCollection, resources: AssetCollection, parent: Entity): IterableIterator[
    js.Object | VariantCollection | typingsSlinky.atFrctlFractal.atFrctlFractalMod.fractal.api.components.Component
  ] = js.native
}

