organization := "org.scalablytyped.slinky"
name := "bookshelf"
version := "v1.0.1-dt-20191209Z-a6b590"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20191111Z-91d0a2",
  "org.scalablytyped.slinky" %%% "create-error" % "0.3.1-dt-20190322Z-df4ca2",
  "org.scalablytyped.slinky" %%% "knex" % "0.19.5-4eb51d",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20191126Z-643ed0",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        