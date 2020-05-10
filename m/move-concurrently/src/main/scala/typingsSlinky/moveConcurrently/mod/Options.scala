package typingsSlinky.moveConcurrently.mod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[T /* <: js.Thenable[Unit] */] extends js.Object {
  /**
    * (Default: global.Promise) The promise implementation to use, defaults to Node's.
    */
  var Promise: js.UndefOr[Instantiable1[/* args (repeated) */ js.Any, T]] = js.native
  /**
    * (Default: require('fs')) The filesystem module to use. Can be used to use graceful-fs or to inject a mock.
    */
  var fs: js.UndefOr[js.Any] = js.native
  /**
    * (Default: process.getuid) A function that returns the current UID. Used to inject a mock.
    */
  var getuid: js.UndefOr[js.Any] = js.native
  /**
    * (Default: process.platform === 'win32') If true enables Windows symlink semantics.
    * This requires an extra stat to determine if the destination of a symlink is a file or directory.
    * If symlinking a directory fails then we'll try making a junction instead.
    */
  var isWindows: js.UndefOr[Boolean] = js.native
  /**
    * (Default: 1) The maximum number of concurrent copies to do at once.
    */
  var maxConcurrency: js.UndefOr[Double] = js.native
  /**
    * (Default: require('fs-write-stream-atomic')) The implementation of writeStreamAtomic to use. Used to inject a mock.
    */
  var writeStreamAtomic: js.UndefOr[js.Any] = js.native
}

object Options {
  @scala.inline
  def apply[T](): Options[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[T]]
  }
  @scala.inline
  implicit class OptionsOps[Self[t] <: Options[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPromise(value: Instantiable1[/* args (repeated) */ js.Any, T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromise: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Promise")(js.undefined)
        ret
    }
    @scala.inline
    def withFs(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFs: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(js.undefined)
        ret
    }
    @scala.inline
    def withGetuid(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetuid: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getuid")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWindows(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWindows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWindows: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWindows")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrency(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrency: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteStreamAtomic(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeStreamAtomic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteStreamAtomic: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeStreamAtomic")(js.undefined)
        ret
    }
  }
  
}

