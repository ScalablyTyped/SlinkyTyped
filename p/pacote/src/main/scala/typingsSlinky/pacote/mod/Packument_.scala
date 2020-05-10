package typingsSlinky.pacote.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pacote.AnonCreated
import typingsSlinky.pacote.AnonLatest
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Packument_
  extends CommonMetadata
     with // Non-standard properties may also appear when fullMetadata = true.
/* key */ StringDictionary[js.Any] {
  /**
    * An object mapping dist-tags to version numbers. This is how `foo@latest`
    * gets turned into `foo@1.2.3`.
    */
  var `dist-tags`: AnonLatest with (Record[String, String]) = js.native
  var name: String = js.native
  /**
    * In the full packument, an object mapping version numbers to publication
    * times, for the `opts.before` functionality.
    */
  var time: js.UndefOr[(Record[String, String]) with AnonCreated] = js.native
  /**
    * An object where each key is a version, and each value is the manifest for
    * that version.
    */
  var versions: Record[String, Manifest_] = js.native
}

object Packument_ {
  @scala.inline
  def apply(
    `dist-tags`: AnonLatest with (Record[String, String]),
    name: String,
    versions: Record[String, Manifest_]
  ): Packument_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packument_]
  }
  @scala.inline
  implicit class Packument_Ops[Self <: Packument_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withDist-tags`(value: AnonLatest with (Record[String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dist-tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersions(value: Record[String, Manifest_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: (Record[String, String]) with AnonCreated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

