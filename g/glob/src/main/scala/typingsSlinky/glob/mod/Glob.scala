package typingsSlinky.glob.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.glob.anon.IsDirectory
import typingsSlinky.glob.globBooleans.`false`
import typingsSlinky.glob.globStrings.DIR
import typingsSlinky.glob.globStrings.FILE
import typingsSlinky.minimatch.mod.IMinimatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("glob", "Glob")
@js.native
class Glob protected () extends IGlob {
  def this(pattern: String) = this()
  def this(pattern: String, cb: js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit]) = this()
  def this(pattern: String, options: IOptions) = this()
  def this(
    pattern: String,
    options: IOptions,
    cb: js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit]
  ) = this()
  /* CompleteClass */
  override var aborted: Boolean = js.native
  /* CompleteClass */
  override var cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]] = js.native
  /* CompleteClass */
  override var found: js.Array[String] = js.native
  /* CompleteClass */
  override var minimatch: IMinimatch = js.native
  /* CompleteClass */
  override var options: IOptions = js.native
  /* CompleteClass */
  override var realpathCache: StringDictionary[String] = js.native
  /* CompleteClass */
  override var statCache: StringDictionary[js.UndefOr[`false` | IsDirectory]] = js.native
  /* CompleteClass */
  override var symlinks: StringDictionary[js.UndefOr[Boolean]] = js.native
}

@JSImport("glob", "Glob")
@js.native
object Glob extends TopLevel[IGlobStatic]

