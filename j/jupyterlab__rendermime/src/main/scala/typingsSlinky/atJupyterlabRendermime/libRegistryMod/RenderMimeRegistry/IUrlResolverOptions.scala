package typingsSlinky.atJupyterlabRendermime.libRegistryMod.RenderMimeRegistry

import typingsSlinky.atJupyterlabApputils.libClientsessionMod.IClientSession
import typingsSlinky.atJupyterlabServices.libContentsMod.Contents.IManager
import typingsSlinky.atJupyterlabServices.libSessionSessionMod.Session.ISession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a UrlResolver.
  */
trait IUrlResolverOptions extends js.Object {
  /**
    * The contents manager used by the resolver.
    */
  var contents: IManager
  /**
    * The session used by the resolver.
    */
  var session: ISession | IClientSession
}

object IUrlResolverOptions {
  @scala.inline
  def apply(contents: IManager, session: ISession | IClientSession): IUrlResolverOptions = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUrlResolverOptions]
  }
}

