package typingsSlinky.enhancedResolve.mod.ResolverFactory

import typingsSlinky.enhancedResolve.commonTypesMod.AbstractInputFileSystem
import typingsSlinky.enhancedResolve.commonTypesMod.ResolverRequest
import typingsSlinky.enhancedResolve.concordMod.Dictionary
import typingsSlinky.enhancedResolve.resolverMod.^
import typingsSlinky.std.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverOption extends js.Object {
  var alias: js.UndefOr[js.Array[AliasItem] | Dictionary[String]] = js.native
  var aliasFields: js.UndefOr[js.Array[String]] = js.native
  var cachePredicate: js.UndefOr[js.Function1[/* val */ ResolverRequest, Boolean]] = js.native
  var descriptionFiles: js.UndefOr[js.Array[String]] = js.native
  var enforceExtension: js.UndefOr[Boolean] = js.native
  var enforceModuleExtension: js.UndefOr[Boolean] = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
  var fileSystem: js.UndefOr[AbstractInputFileSystem] = js.native
  var mainFields: js.UndefOr[js.Array[String]] = js.native
  var mainFiles: js.UndefOr[js.Array[String]] = js.native
  var moduleExtensions: js.UndefOr[js.Array[String]] = js.native
  var modules: js.UndefOr[js.Array[String]] = js.native
  var plugins: js.UndefOr[js.Array[Plugin]] = js.native
  var resolveToContext: js.UndefOr[Boolean] = js.native
  var resolver: js.UndefOr[^] = js.native
  var symlinks: js.UndefOr[js.Array[String] | Boolean] = js.native
  var unsafeCache: js.UndefOr[Boolean | Dictionary[_]] = js.native
  var useSyncFileSystemCalls: js.UndefOr[Boolean] = js.native
}

object ResolverOption {
  @scala.inline
  def apply(): ResolverOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverOption]
  }
  @scala.inline
  implicit class ResolverOptionOps[Self <: ResolverOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: js.Array[AliasItem] | Dictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withAliasFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasFields")(js.undefined)
        ret
    }
    @scala.inline
    def withCachePredicate(value: /* val */ ResolverRequest => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachePredicate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCachePredicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachePredicate")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptionFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforceExtension(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforceModuleExtension(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceModuleExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceModuleExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceModuleExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSystem(value: AbstractInputFileSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withMainFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainFields")(js.undefined)
        ret
    }
    @scala.inline
    def withMainFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withModules(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[Plugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveToContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveToContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveToContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveToContext")(js.undefined)
        ret
    }
    @scala.inline
    def withResolver(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(js.undefined)
        ret
    }
    @scala.inline
    def withSymlinks(value: js.Array[String] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symlinks")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsafeCache(value: Boolean | Dictionary[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafeCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsafeCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafeCache")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSyncFileSystemCalls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSyncFileSystemCalls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSyncFileSystemCalls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSyncFileSystemCalls")(js.undefined)
        ret
    }
  }
  
}

