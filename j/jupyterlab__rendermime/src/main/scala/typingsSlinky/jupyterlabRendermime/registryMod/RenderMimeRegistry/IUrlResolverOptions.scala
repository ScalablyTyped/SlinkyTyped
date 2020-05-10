package typingsSlinky.jupyterlabRendermime.registryMod.RenderMimeRegistry

import typingsSlinky.jupyterlabApputils.clientsessionMod.IClientSession
import typingsSlinky.jupyterlabServices.contentsMod.Contents.IManager
import typingsSlinky.jupyterlabServices.sessionSessionMod.Session.ISession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a UrlResolver.
  */
@js.native
trait IUrlResolverOptions extends js.Object {
  /**
    * The contents manager used by the resolver.
    */
  var contents: IManager = js.native
  /**
    * The session used by the resolver.
    */
  var session: ISession | IClientSession = js.native
}

object IUrlResolverOptions {
  @scala.inline
  def apply(contents: IManager, session: ISession | IClientSession): IUrlResolverOptions = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUrlResolverOptions]
  }
  @scala.inline
  implicit class IUrlResolverOptionsOps[Self <: IUrlResolverOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContents(value: IManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: ISession | IClientSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

