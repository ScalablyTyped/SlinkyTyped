package typingsSlinky.pgPromise.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.pgPromise.pgSubsetMod.IClient
import typingsSlinky.pgPromise.pgSubsetMod.IConnectionParameters
import typingsSlinky.pgPromise.pgSubsetMod.IDefaults
import typingsSlinky.pgPromise.pgSubsetMod.ITypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpg extends js.Object {
  val Client: Instantiable1[/* config */ String | IConnectionParameters[IClient], IClient] = js.native
  val defaults: IDefaults = js.native
  val types: ITypes = js.native
}

object Typeofpg {
  @scala.inline
  def apply(
    Client: Instantiable1[/* config */ String | IConnectionParameters[IClient], IClient],
    defaults: IDefaults,
    types: ITypes
  ): Typeofpg = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofpg]
  }
  @scala.inline
  implicit class TypeofpgOps[Self <: Typeofpg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: Instantiable1[/* config */ String | IConnectionParameters[IClient], IClient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaults(value: IDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: ITypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

