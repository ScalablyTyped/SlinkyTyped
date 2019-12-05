package typingsSlinky.matcherDashCollection.matcherDashCollectionMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.matcherDashCollection.Anon_Match
import typingsSlinky.minimatch.minimatchMod.IMinimatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matcher-collection", JSImport.Namespace)
@js.native
class ^ protected () extends Anon_Match {
  def this(matchers: js.Array[String | IMinimatch]) = this()
  /* CompleteClass */
  override var matchers: js.Array[IMinimatch] = js.native
  /* CompleteClass */
  override def `match`(value: String): Boolean = js.native
  /* CompleteClass */
  override def mayContain(value: String): Boolean = js.native
}

@JSImport("matcher-collection", JSImport.Namespace)
@js.native
object ^
  extends TopLevel[Instantiable1[/* matchers */ js.Array[String | IMinimatch], Anon_Match]]

