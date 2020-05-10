package typingsSlinky.fileLoader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Specifies a custom file context.
    *
    * @example
    * module.exports = {
    *   module: {
    *     rules: [
    *       {
    *         test: /\.(png|jpe?g|gif)$/i,
    *         use: [
    *           {
    *             loader: 'file-loader',
    *             options: {
    *               context: 'project',
    *             },
    *           },
    *         ],
    *       },
    *     ],
    *   },
    * };
    *
    * @default {@link https://webpack.js.org/configuration/entry-context/#context context}
    */
  var context: js.UndefOr[String] = js.native
  /**
    * If `true`, emits a file (writes a file to the filesystem); otherwise, the loader will return a public URI
    * but will not emit the file. It is often useful to disable this option for server-side packages.
    *
    * @default true
    */
  var emitFile: js.UndefOr[Boolean] = js.native
  /**
    * Specifies a custom filename template for the target file(s) using the query parameter name.
    *
    * By default the path and name you specify will output the file in that same directory,
    * and will also use the same URI path to access the file.
    *
    * For example, to emit a file from your context directory into the output directory retaining the full
    * directory structure, you might use:
    *
    * @example
    * module.exports = {
    *   module: {
    *     rules: [
    *       {
    *         test: /\.(png|jpe?g|gif)$/i,
    *         loader: 'file-loader',
    *         options: {
    *           name: '[path][name].[ext]',
    *         },
    *       },
    *     ],
    *   },
    * };
    *
    * @example
    * module.exports = {
    *  module: {
    *    rules: [
    *      {
    *        test: /\.(png|jpe?g|gif)$/i,
    *        loader: 'file-loader',
    *        options: {
    *          name(file) {
    *            if (process.env.NODE_ENV === 'development') {
    *              return '[path][name].[ext]';
    *            }
    *
    *            return '[contenthash].[ext]';
    *          },
    *        },
    *      },
    *    ],
    *  },
    * };
    *
    * @default '[contenthash].[ext]'
    */
  var name: js.UndefOr[String | (js.Function1[/* file */ String, String])] = js.native
  /**
    * Specify a filesystem path where the target file(s) will be placed.
    *
    * Function gets passes the original absolute path to the asset,
    * as well as the directory where assets are stored.
    *
    * @example
    * module.exports = {
    *   module: {
    *     rules: [
    *       {
    *         test: /\.(png|jpe?g|gif)$/i,
    *         loader: 'file-loader',
    *         options: {
    *           outputPath: (url, resourcePath, context) => {
    *             if (/my-custom-image\.png/.test(resourcePath)) {
    *               return `other_output_path/${url}`;
    *             }
    *
    *             if (/images/.test(context)) {
    *               return `image_output_path/${url}`;
    *             }
    *
    *             return `output_path/${url}`;
    *           },
    *         },
    *       },
    *     ],
    *   },
    * };
    *
    * @default undefined
    */
  var outputPath: js.UndefOr[String | BuildResourcePathFn] = js.native
  /**
    * Specifies a custom function to post-process the generated public path.
    *
    * This can be used to prepend or append dynamic global variables that are only available at runtime, like
    * `__webpack_public_path__`. This would not be possible with just publicPath, since it stringifies the values.
    *
    * @example
    * module.exports = {
    *   module: {
    *     rules: [
    *       {
    *         test: /\.(png|jpg|gif)$/i,
    *         loader: 'file-loader',
    *         options: {
    *           publicPath: '/some/path/',
    *           postTransformPublicPath: (p) => `__webpack_public_path__ + ${p}`,
    *         },
    *       },
    *     ],
    *   },
    * };
    *
    * @default undefined
    */
  var postTransformPublicPath: js.UndefOr[js.Function1[/* p */ String, String]] = js.native
  /**
    * Specifies a custom public path for the target file(s).
    *
    * Function gets passes the original absolute path to the asset,
    * as well as the directory where assets are stored.
    *
    * @example
    * module.exports = {
    *  module: {
    *    rules: [
    *      {
    *        test: /\.(png|jpe?g|gif)$/i,
    *        loader: 'file-loader',
    *        options: {
    *          publicPath: (url, resourcePath, context) => {
    *            if (/my-custom-image\.png/.test(resourcePath)) {
    *              return `other_public_path/${url}`;
    *            }
    *
    *            if (/images/.test(context)) {
    *              return `image_output_path/${url}`;
    *            }
    *
    *            return `public_path/${url}`;
    *          },
    *        },
    *      },
    *    ],
    *  },
    * };
    *
    * @default {@link https://webpack.js.org/api/module-variables/#__webpack_public_path__-webpack-specific __webpack_public_path__}
    */
  var publicPath: js.UndefOr[String | BuildResourcePathFn] = js.native
  /**
    * Specifies a Regular Expression to one or many parts of the target file path.
    * The capture groups can be reused in the name property using [N]
    * {@link https://github.com/webpack-contrib/file-loader#placeholders placeholder}.
    *
    * If [0] is used, it will be replaced by the entire tested string,
    * whereas [1] will contain the first capturing parenthesis of your regex and so on...
    *
    * @example
    * // file.js
    * import img from './customer01/file.png';
    *
    * // webpack.config.js
    * module.exports = {
    *   module: {
    *     rules: [
    *       {
    *         test: /\.(png|jpe?g|gif)$/i,
    *         use: [
    *           {
    *             loader: 'file-loader',
    *             options: {
    *               regExp: /\/([a-z0-9]+)\/[a-z0-9]+\.png$/i,
    *               name: '[1]-[name].[ext]',
    *             },
    *           },
    *         ],
    *       },
    *     ],
    *   },
    * };
    *
    * @default undefined
    */
  var regExp: js.UndefOr[js.RegExp] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitFile")(js.undefined)
        ret
    }
    @scala.inline
    def withNameFunction1(value: /* file */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String | (js.Function1[/* file */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputPathFunction3(value: (/* url */ String, /* resourcePath */ String, /* context */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOutputPath(value: String | BuildResourcePathFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPostTransformPublicPath(value: /* p */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postTransformPublicPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPostTransformPublicPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postTransformPublicPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicPathFunction3(value: (/* url */ String, /* resourcePath */ String, /* context */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPublicPath(value: String | BuildResourcePathFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regExp")(js.undefined)
        ret
    }
  }
  
}

