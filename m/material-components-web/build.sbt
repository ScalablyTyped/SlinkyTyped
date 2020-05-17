organization := "org.scalablytyped.slinky"
name := "material-components-web"
version := "4.0.0-c4a506"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "material__auto-init" % "0.35-dt-20190213Z-c3a759",
  "org.scalablytyped.slinky" %%% "material__base" % "0.35-dt-20191126Z-599278",
  "org.scalablytyped.slinky" %%% "material__checkbox" % "0.35-dt-20191126Z-5cacd9",
  "org.scalablytyped.slinky" %%% "material__chips" % "0.35-dt-20191126Z-1dab06",
  "org.scalablytyped.slinky" %%% "material__data-table" % "4.0.0-63180c",
  "org.scalablytyped.slinky" %%% "material__dialog" % "0.35-dt-20191126Z-9fc54c",
  "org.scalablytyped.slinky" %%% "material__drawer" % "0.43-dt-20191126Z-65dc30",
  "org.scalablytyped.slinky" %%% "material__floating-label" % "0.35-dt-20191126Z-dc6e0f",
  "org.scalablytyped.slinky" %%% "material__form-field" % "0.35-dt-20191126Z-9a198a",
  "org.scalablytyped.slinky" %%% "material__grid-list" % "0.35-dt-20191126Z-020fde",
  "org.scalablytyped.slinky" %%% "material__icon-button" % "4.0.0-c9df3e",
  "org.scalablytyped.slinky" %%% "material__line-ripple" % "0.35-dt-20191126Z-5bf5a5",
  "org.scalablytyped.slinky" %%% "material__linear-progress" % "0.35-dt-20191126Z-d31058",
  "org.scalablytyped.slinky" %%% "material__list" % "0.43-dt-20191126Z-b849e1",
  "org.scalablytyped.slinky" %%% "material__menu" % "0.35-dt-20191126Z-508ae3",
  "org.scalablytyped.slinky" %%% "material__menu-surface" % "4.0.0-0f1e6d",
  "org.scalablytyped.slinky" %%% "material__notched-outline" % "0.35-dt-20191126Z-2ead42",
  "org.scalablytyped.slinky" %%% "material__radio" % "0.35-dt-20191126Z-bf7df8",
  "org.scalablytyped.slinky" %%% "material__ripple" % "0.35-dt-20191126Z-dca2fe",
  "org.scalablytyped.slinky" %%% "material__select" % "0.35-dt-20191126Z-9b83e2",
  "org.scalablytyped.slinky" %%% "material__selection-control" % "0.35-dt-20190213Z-f9bc7a",
  "org.scalablytyped.slinky" %%% "material__slider" % "0.35-dt-20191126Z-12626b",
  "org.scalablytyped.slinky" %%% "material__snackbar" % "0.35-dt-20191126Z-60d439",
  "org.scalablytyped.slinky" %%% "material__switch" % "4.0.0-d2626a",
  "org.scalablytyped.slinky" %%% "material__tab" % "0.35-dt-20191126Z-cafae7",
  "org.scalablytyped.slinky" %%% "material__tab-bar" % "4.0.0-5055c0",
  "org.scalablytyped.slinky" %%% "material__tab-indicator" % "4.0.0-e0f50d",
  "org.scalablytyped.slinky" %%% "material__tab-scroller" % "4.0.0-0ca734",
  "org.scalablytyped.slinky" %%% "material__textfield" % "0.35-dt-20191126Z-54d9f1",
  "org.scalablytyped.slinky" %%% "material__top-app-bar" % "0.35-dt-20191126Z-31e945",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
