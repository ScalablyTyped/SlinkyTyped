organization := "org.scalablytyped.slinky"
name := "react-redux"
version := "7.1-dt-20200225Z-03f0fc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-89abae",
  "org.scalablytyped.slinky" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-0fa30c",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-6bb503",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200227Z-f18fda",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.5-9d78fe",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
