package typingsSlinky.hexo.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.hexo.anon.Autodetect
import typingsSlinky.hexo.hexoBooleans.`false`
import typingsSlinky.hexo.mod.extend.Deployer.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HexoConfig
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Archive directory
    */
  val archive_dir: String = js.native
  /*
    * Your name
    */
  val author: String = js.native
  /**
    * Category directory
    */
  val category_dir: String = js.native
  /**
    * Category slugs
    */
  val category_map: StringDictionary[String | Double] = js.native
  /**
    * Include code directory (subdirectory of source_dir)
    */
  val code_dir: String = js.native
  /**
    * Date format
    * https://momentjs.com/
    */
  val date_format: String = js.native
  /**
    * Default category
    */
  val default_category: String = js.native
  /**
    * Default layout
    */
  val default_layout: String = js.native
  /**
    * Deployment settings
    */
  val deploy: Config | Null = js.native
  /**
    * The description of your website
    */
  val description: String = js.native
  /**
    * Hexo process will ignore files list under this field
    */
  val exclude: js.UndefOr[js.Array[String]] = js.native
  /**
    * Open external links in a new tab?
    */
  val external_link: Boolean = js.native
  /**
    * Transform filenames to 1 lower case; 2 upper case
    */
  val filename_case: Double = js.native
  /**
    * Display future posts?
    */
  val future: Boolean = js.native
  /**
    * Code block settings
    */
  val highlight: Autodetect = js.native
  /**
    * i18n directory
    */
  val i18n_dir: String = js.native
  val ignore: js.Array[String] = js.native
  /**
    * Hexo by default ignores hidden files and folders, but setting this field will make Hexo process them
    */
  val include: js.UndefOr[js.Array[String]] = js.native
  /**
    * The language of your website. Use a 2-lettter ISO-639-1 code. Default is en.
    */
  val language: String = js.native
  /**
    * The filename format for new posts
    */
  val new_post_name: String = js.native
  /**
    * Pagination directory
    */
  val pagination_dir: String = js.native
  /**
    * The amount of posts displayed on a single page. 0 disables pagination
    */
  val per_page: Double = js.native
  /**
    * The permalink format of articles
    */
  val permalink: String = js.native
  /**
    * Default values of each segment in permalink
    */
  val permalink_defaults: String | Null = js.native
  /**
    * Enable the Asset Folder?
    */
  val post_asset_folder: Boolean = js.native
  /**
    * Public folder. Where the static site will be generated
    */
  val public_dir: String = js.native
  /**
    * Make links relative to the root folder?
    */
  val relative_link: Boolean = js.native
  /**
    * Display drafts?
    */
  val render_drafts: Boolean = js.native
  /**
    * The root directory of your website
    */
  val root: String = js.native
  /**
    * Paths that will be copied to public raw, without being rendered. You can use glob expressions for path matching.
    */
  val skip_render: String | js.Array[String] | Null = js.native
  /**
    * Source folder. Where your content is stored
    */
  val source_dir: String = js.native
  /**
    * The subtitle of your website
    */
  val subtitle: String = js.native
  /**
    * Tag directory
    */
  val tag_dir: String = js.native
  /**
    * Tag slugs
    */
  val tag_map: StringDictionary[String | Double] = js.native
  /**
    * Theme name. false disables theming
    */
  val theme: String | `false` = js.native
  /**
    * Theme configuration. Include any custom theme settings under this key to override theme defaults.
    */
  val theme_config: StringDictionary[String | Double] = js.native
  /**
    * Time format
    * https://momentjs.com/
    */
  val time_format: String = js.native
  /**
    * The timezone of your website. Hexo uses the setting on your computer by default.
    * You can find the list of available timezones [here]{@link https://en.wikipedia.org/wiki/List_of_tz_database_time_zones} .
    * Some examples are `America/New_York` , `Japan` , and `UTC` .
    */
  val timezone: String = js.native
  /**
    * The title of your website
    */
  val title: String = js.native
  /**
    * Transform titles into title case?
    */
  val titlecase: Boolean = js.native
  /*
    * The URL of your website
    */
  val url: String = js.native
}

object HexoConfig {
  @scala.inline
  def apply(
    archive_dir: String,
    author: String,
    category_dir: String,
    category_map: StringDictionary[String | Double],
    code_dir: String,
    date_format: String,
    default_category: String,
    default_layout: String,
    description: String,
    external_link: Boolean,
    filename_case: Double,
    future: Boolean,
    highlight: Autodetect,
    i18n_dir: String,
    ignore: js.Array[String],
    language: String,
    new_post_name: String,
    pagination_dir: String,
    per_page: Double,
    permalink: String,
    post_asset_folder: Boolean,
    public_dir: String,
    relative_link: Boolean,
    render_drafts: Boolean,
    root: String,
    source_dir: String,
    subtitle: String,
    tag_dir: String,
    tag_map: StringDictionary[String | Double],
    theme: String | `false`,
    theme_config: StringDictionary[String | Double],
    time_format: String,
    timezone: String,
    title: String,
    titlecase: Boolean,
    url: String
  ): HexoConfig = {
    val __obj = js.Dynamic.literal(archive_dir = archive_dir.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], category_dir = category_dir.asInstanceOf[js.Any], category_map = category_map.asInstanceOf[js.Any], code_dir = code_dir.asInstanceOf[js.Any], date_format = date_format.asInstanceOf[js.Any], default_category = default_category.asInstanceOf[js.Any], default_layout = default_layout.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], external_link = external_link.asInstanceOf[js.Any], filename_case = filename_case.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], i18n_dir = i18n_dir.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], new_post_name = new_post_name.asInstanceOf[js.Any], pagination_dir = pagination_dir.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], post_asset_folder = post_asset_folder.asInstanceOf[js.Any], public_dir = public_dir.asInstanceOf[js.Any], relative_link = relative_link.asInstanceOf[js.Any], render_drafts = render_drafts.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], source_dir = source_dir.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], tag_dir = tag_dir.asInstanceOf[js.Any], tag_map = tag_map.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], theme_config = theme_config.asInstanceOf[js.Any], time_format = time_format.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlecase = titlecase.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexoConfig]
  }
  @scala.inline
  implicit class HexoConfigOps[Self <: HexoConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchive_dir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archive_dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory_dir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category_dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory_map(value: StringDictionary[String | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category_map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode_dir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code_dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate_format(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault_category(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault_layout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal_link(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename_case(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename_case")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFuture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("future")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlight(value: Autodetect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withI18n_dir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n_dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnore(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNew_post_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_post_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagination_dir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination_dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPer_page(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermalink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permalink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPost_asset_folder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_asset_folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublic_dir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelative_link(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative_link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender_drafts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render_drafts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_dir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag_dir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag_dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag_map(value: StringDictionary[String | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag_map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme_config(value: StringDictionary[String | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme_config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime_format(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitlecase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlecase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploy(value: Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeployNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploy")(null)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withPermalink_defaults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permalink_defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermalink_defaultsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permalink_defaults")(null)
        ret
    }
    @scala.inline
    def withSkip_render(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkip_renderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_render")(null)
        ret
    }
  }
  
}

