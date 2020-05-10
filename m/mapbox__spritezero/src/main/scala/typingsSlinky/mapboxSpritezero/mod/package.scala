package typingsSlinky.mapboxSpritezero

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DataLayout = org.scalablytyped.runtime.StringDictionary[typingsSlinky.mapboxSpritezero.mod.StructuredData]
  type ExtractCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* metadata */ typingsSlinky.mapboxSpritezero.mod.Metadata, 
    scala.Unit
  ]
  type GenerateImageCallback = js.Function2[/* err */ js.Error | scala.Null, /* img */ typingsSlinky.node.Buffer, scala.Unit]
  type GenerateLayoutCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* layout */ typingsSlinky.mapboxSpritezero.mod.DataLayout | typingsSlinky.mapboxSpritezero.mod.ImgLayout, 
    scala.Unit
  ]
  type Metadata = org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double | js.Array[scala.Double]]]
}
