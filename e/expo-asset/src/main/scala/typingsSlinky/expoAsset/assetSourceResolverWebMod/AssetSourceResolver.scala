package typingsSlinky.expoAsset.assetSourceResolverWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetSourceResolver extends js.Object {
  var asset: PackagerAsset = js.native
  var jsbundleUrl: js.UndefOr[String | Null] = js.native
  var serverUrl: js.UndefOr[String | Null] = js.native
  def assetServerURL(): ResolvedAssetSource = js.native
  def defaultAsset(): ResolvedAssetSource = js.native
  def drawableFolderInBundle(): ResolvedAssetSource = js.native
  def fromSource(source: String): ResolvedAssetSource = js.native
  def isLoadedFromFileSystem(): Boolean = js.native
  def isLoadedFromServer(): Boolean = js.native
  def resourceIdentifierWithoutScale(): ResolvedAssetSource = js.native
  def scaledAssetPath(): ResolvedAssetSource = js.native
  def scaledAssetURLNearBundle(): ResolvedAssetSource = js.native
}

object AssetSourceResolver {
  @scala.inline
  def apply(
    asset: PackagerAsset,
    assetServerURL: () => ResolvedAssetSource,
    defaultAsset: () => ResolvedAssetSource,
    drawableFolderInBundle: () => ResolvedAssetSource,
    fromSource: String => ResolvedAssetSource,
    isLoadedFromFileSystem: () => Boolean,
    isLoadedFromServer: () => Boolean,
    resourceIdentifierWithoutScale: () => ResolvedAssetSource,
    scaledAssetPath: () => ResolvedAssetSource,
    scaledAssetURLNearBundle: () => ResolvedAssetSource
  ): AssetSourceResolver = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any], assetServerURL = js.Any.fromFunction0(assetServerURL), defaultAsset = js.Any.fromFunction0(defaultAsset), drawableFolderInBundle = js.Any.fromFunction0(drawableFolderInBundle), fromSource = js.Any.fromFunction1(fromSource), isLoadedFromFileSystem = js.Any.fromFunction0(isLoadedFromFileSystem), isLoadedFromServer = js.Any.fromFunction0(isLoadedFromServer), resourceIdentifierWithoutScale = js.Any.fromFunction0(resourceIdentifierWithoutScale), scaledAssetPath = js.Any.fromFunction0(scaledAssetPath), scaledAssetURLNearBundle = js.Any.fromFunction0(scaledAssetURLNearBundle))
    __obj.asInstanceOf[AssetSourceResolver]
  }
  @scala.inline
  implicit class AssetSourceResolverOps[Self <: AssetSourceResolver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsset(value: PackagerAsset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssetServerURL(value: () => ResolvedAssetSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetServerURL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefaultAsset(value: () => ResolvedAssetSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAsset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDrawableFolderInBundle(value: () => ResolvedAssetSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawableFolderInBundle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFromSource(value: String => ResolvedAssetSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsLoadedFromFileSystem(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoadedFromFileSystem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLoadedFromServer(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoadedFromServer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResourceIdentifierWithoutScale(value: () => ResolvedAssetSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIdentifierWithoutScale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScaledAssetPath(value: () => ResolvedAssetSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaledAssetPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScaledAssetURLNearBundle(value: () => ResolvedAssetSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaledAssetURLNearBundle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withJsbundleUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsbundleUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsbundleUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsbundleUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withJsbundleUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsbundleUrl")(null)
        ret
    }
    @scala.inline
    def withServerUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withServerUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverUrl")(null)
        ret
    }
  }
  
}

