package typingsSlinky.loaderRunner.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunLoaderOption extends js.Object {
  var context: js.Any = js.native
  var loaders: js.Array[_] = js.native
  var resource: String = js.native
  def readResource(
    filename: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer | Null, Unit]
  ): Unit = js.native
}

object RunLoaderOption {
  @scala.inline
  def apply(
    context: js.Any,
    loaders: js.Array[_],
    readResource: (String, js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer | Null, Unit]) => Unit,
    resource: String
  ): RunLoaderOption = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], loaders = loaders.asInstanceOf[js.Any], readResource = js.Any.fromFunction2(readResource), resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunLoaderOption]
  }
  @scala.inline
  implicit class RunLoaderOptionOps[Self <: RunLoaderOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaders(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadResource(
      value: (String, js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer | Null, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readResource")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

