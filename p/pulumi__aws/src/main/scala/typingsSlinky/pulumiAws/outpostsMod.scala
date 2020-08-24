package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.getOutpostInstanceTypeMod.GetOutpostInstanceTypeArgs
import typingsSlinky.pulumiAws.getOutpostInstanceTypeMod.GetOutpostInstanceTypeResult
import typingsSlinky.pulumiAws.getOutpostInstanceTypesMod.GetOutpostInstanceTypesArgs
import typingsSlinky.pulumiAws.getOutpostInstanceTypesMod.GetOutpostInstanceTypesResult
import typingsSlinky.pulumiAws.getOutpostMod.GetOutpostArgs
import typingsSlinky.pulumiAws.getOutpostMod.GetOutpostResult
import typingsSlinky.pulumiAws.getOutpostsMod.GetOutpostsArgs
import typingsSlinky.pulumiAws.getOutpostsMod.GetOutpostsResult
import typingsSlinky.pulumiAws.getSiteMod.GetSiteArgs
import typingsSlinky.pulumiAws.getSiteMod.GetSiteResult
import typingsSlinky.pulumiAws.getSitesMod.GetSitesResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/outposts", JSImport.Namespace)
@js.native
object outpostsMod extends js.Object {
  def getOutpost(): js.Promise[GetOutpostResult] = js.native
  def getOutpost(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetOutpostResult] = js.native
  def getOutpost(args: GetOutpostArgs): js.Promise[GetOutpostResult] = js.native
  def getOutpost(args: GetOutpostArgs, opts: InvokeOptions): js.Promise[GetOutpostResult] = js.native
  def getOutpostInstanceType(args: GetOutpostInstanceTypeArgs): js.Promise[GetOutpostInstanceTypeResult] = js.native
  def getOutpostInstanceType(args: GetOutpostInstanceTypeArgs, opts: InvokeOptions): js.Promise[GetOutpostInstanceTypeResult] = js.native
  def getOutpostInstanceTypes(args: GetOutpostInstanceTypesArgs): js.Promise[GetOutpostInstanceTypesResult] = js.native
  def getOutpostInstanceTypes(args: GetOutpostInstanceTypesArgs, opts: InvokeOptions): js.Promise[GetOutpostInstanceTypesResult] = js.native
  def getOutposts(): js.Promise[GetOutpostsResult] = js.native
  def getOutposts(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetOutpostsResult] = js.native
  def getOutposts(args: GetOutpostsArgs): js.Promise[GetOutpostsResult] = js.native
  def getOutposts(args: GetOutpostsArgs, opts: InvokeOptions): js.Promise[GetOutpostsResult] = js.native
  def getSite(): js.Promise[GetSiteResult] = js.native
  def getSite(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSiteResult] = js.native
  def getSite(args: GetSiteArgs): js.Promise[GetSiteResult] = js.native
  def getSite(args: GetSiteArgs, opts: InvokeOptions): js.Promise[GetSiteResult] = js.native
  def getSites(): js.Promise[GetSitesResult] = js.native
  def getSites(opts: InvokeOptions): js.Promise[GetSitesResult] = js.native
}

