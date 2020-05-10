package typingsSlinky.depcheck.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Results extends js.Object {
  var dependencies: js.Array[String] = js.native
  var devDependencies: js.Array[String] = js.native
  var invalidDirs: StringDictionary[js.Any] = js.native
  var invalidFiles: StringDictionary[js.Any] = js.native
  var missing: StringDictionary[js.Array[String]] = js.native
  var using: StringDictionary[js.Array[String]] = js.native
}

object Results {
  @scala.inline
  def apply(
    dependencies: js.Array[String],
    devDependencies: js.Array[String],
    invalidDirs: StringDictionary[js.Any],
    invalidFiles: StringDictionary[js.Any],
    missing: StringDictionary[js.Array[String]],
    using: StringDictionary[js.Array[String]]
  ): Results = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], devDependencies = devDependencies.asInstanceOf[js.Any], invalidDirs = invalidDirs.asInstanceOf[js.Any], invalidFiles = invalidFiles.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], using = using.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  @scala.inline
  implicit class ResultsOps[Self <: Results] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependencies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevDependencies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidDirs(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidDirs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidFiles(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMissing(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsing(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("using")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

