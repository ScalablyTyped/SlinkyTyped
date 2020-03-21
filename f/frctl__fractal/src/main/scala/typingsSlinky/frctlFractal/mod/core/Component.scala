package typingsSlinky.frctlFractal.mod.core

import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.frctlFractal.mod.fractal.api.assets.AssetCollection
import typingsSlinky.frctlFractal.mod.fractal.api.files.FileCollection
import typingsSlinky.frctlFractal.mod.fractal.api.variants.VariantCollection
import typingsSlinky.frctlFractal.mod.fractal.core.entities.Entity
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
      typingsSlinky.frctlFractal.mod.fractal.api.components.Component
    ] {
  def create(config: js.Object, files: FileCollection, resources: AssetCollection, parent: Entity): IterableIterator[
    js.Object | VariantCollection | typingsSlinky.frctlFractal.mod.fractal.api.components.Component
  ] = js.native
}

