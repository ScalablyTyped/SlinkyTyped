package typingsSlinky.parcelBundler.mod

import typingsSlinky.std.Map
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParcelBundle extends js.Object {
  /**
    * A Set of all assets inside the bundle
    */
  var assets: Set[_] = js.native
  /**
    * A Set of all child bundles
    */
  var childBundles: Set[_] = js.native
  /**
    * The entryPoint of the bundle, used for generating the name and gathering assets.
    */
  var entryAsset: js.Any = js.native
  /**
    * The name of the bundle (generated using Asset.generateBundleName() of entryAsset)
    */
  var name: String = js.native
  /**
    * A Map<Asset, number(line number inside the bundle)> of all the locations of the assets inside the bundle, used to generate accurate source maps
    */
  var offsets: Map[ParcelAsset, Double] = js.native
  /**
    * The parent bundle, is null in case of the entry bundleany
    */
  var parentBundle: js.UndefOr[js.Any] = js.native
  /**
    * A Set of all sibling bundles
    */
  var siblingBundles: Set[_] = js.native
  /**
    * A Map<String(Type: js, css, map, ...), Bundle> of all sibling bundles
    */
  var siblingBundlesMap: Map[String, ParcelBundle] = js.native
  /**
    * The type of assets it contains (e.g. js, css, map, ...)
    */
  var `type`: String = js.native
}

object ParcelBundle {
  @scala.inline
  def apply(
    assets: Set[_],
    childBundles: Set[_],
    entryAsset: js.Any,
    name: String,
    offsets: Map[ParcelAsset, Double],
    siblingBundles: Set[_],
    siblingBundlesMap: Map[String, ParcelBundle],
    `type`: String
  ): ParcelBundle = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], childBundles = childBundles.asInstanceOf[js.Any], entryAsset = entryAsset.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], siblingBundles = siblingBundles.asInstanceOf[js.Any], siblingBundlesMap = siblingBundlesMap.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParcelBundle]
  }
  @scala.inline
  implicit class ParcelBundleOps[Self <: ParcelBundle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssets(value: Set[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildBundles(value: Set[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childBundles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntryAsset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsets(value: Map[ParcelAsset, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSiblingBundles(value: Set[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siblingBundles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSiblingBundlesMap(value: Map[String, ParcelBundle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siblingBundlesMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentBundle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentBundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentBundle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentBundle")(js.undefined)
        ret
    }
  }
  
}

