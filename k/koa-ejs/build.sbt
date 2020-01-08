organization := "org.scalablytyped.slinky"
name := "koa-ejs"
version := "4.2-dt-20190827Z-eb7011"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "accepts" % "1.3-dt-20180214Z-11030c",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.17-dt-20190819Z-ee62c5",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20191217Z-4825ba",
  "org.scalablytyped.slinky" %%% "cookies" % "0.7-dt-20191002Z-74c9cf",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20191101Z-1aa7b6",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20191220Z-040290",
  "org.scalablytyped.slinky" %%% "keygrip" % "1.0-dt-20191226Z-e8b4e9",
  "org.scalablytyped.slinky" %%% "koa" % "2.11.0-dt-20191127Z-f75589",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-0f6108",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-e91b01",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20190819Z-2c1738",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        