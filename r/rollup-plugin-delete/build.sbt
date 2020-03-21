organization := "org.scalablytyped.slinky"
name := "rollup-plugin-delete"
version := "1.2.0-9d71b7"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "braces" % "3.0-dt-20190422Z-ca0fcc",
  "org.scalablytyped.slinky" %%% "del" % "5.1.0-bc569e",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200225Z-7e1416",
  "org.scalablytyped.slinky" %%% "fast-glob" % "2.2.7-b52ee6",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200226Z-2f6948",
  "org.scalablytyped.slinky" %%% "globby" % "10.0.2-52918f",
  "org.scalablytyped.slinky" %%% "micromatch" % "4.0-dt-20200226Z-e2bdd9",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200226Z-befe22",
  "org.scalablytyped.slinky" %%% "mrmlnc__readdir-enhanced" % "2.2.1-0e17fb",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "rollup" % "1.31.1-0097d2",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
