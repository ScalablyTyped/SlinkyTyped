package typingsSlinky.makerJs.global.MakerJs

import typingsSlinky.makerJs.MakerJs.ICollectionKeyComparer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Collects items that share a common key.
  */
@JSGlobal("MakerJs.Collector")
@js.native
class Collector[K, T] ()
  extends typingsSlinky.makerJs.MakerJs.Collector[K, T] {
  def this(comparer: ICollectionKeyComparer[K]) = this()
}
